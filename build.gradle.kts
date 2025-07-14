plugins {
    id("java-library")
    id("maven-publish")
    id("idea")
    id("earth.terrarium.cloche") version "0.11.6"
    id("me.fallenbreath.yamlang") version "1.4.1"
}

fun p(property: String) = property(property) as String

group = p("mod_group_id")
version = p("mod_version")

repositories {
    cloche.librariesMinecraft()

    mavenCentral()

    cloche {
        main()

        mavenNeoforgedMeta()
        mavenNeoforged()
    }

    // Cygnus and Lazuli
    exclusiveContent {
        forRepository {
            maven("https://jitpack.io")
        }
        filter {
            includeGroup("com.github.nebula-modding")
            includeModule("com.github.emmathemartian", "lazuli")
        }
    }

    // Cygnus Dependencies
    maven("https://thedarkcolour.github.io/KotlinForForge/")
    maven("https://codeberg.org/EmmaTheMartian/dapper/raw/branch/main/repo/")

    // For EMI
    maven("https://maven.terraformersmc.com")

    // For JEI
    maven("https://maven.blamejared.com/")

    // For Mekanism
    maven("https://modmaven.dev")

    // For AppleSkin
    maven("https://maven.ryanliptak.com")

    // For Create, AppleSkin, Jade, and Stellar View
    maven("https://api.modrinth.com/maven")

    // DevAuth
    maven("https://pkgs.dev.azure.com/djtheredstoner/DevAuth/_packaging/public/maven/v1")
}

cloche {
    metadata {
        modId = p("mod_id")
        name = p("mod_name")
        description = p("mod_description")
        license = p("mod_license")
        icon = p("mod_icon")
        url = p("mod_url")
        issues = p("mod_issues")
        author(p("mod_authors"))
        contributor(p("mod_contributors"))
    }

    val common21 = common("21:x")
    // val common22 = common("22:x")

    neoforge("21:1") {
        minecraftVersion = "1.21.1"
        loaderVersion = p("neo_21.1_version")

        dependsOn(common21)

        data()

        runs {
            server()
            client()
            data()
        }

        metadata {
            // todo: make Centaurus load after
            dependency {
                modId = "cygnus"
                required = true
                version("${p("cygnus_21.1_dependency_version")}+1.21.1")
            }
        }

        dependencies {
            // Cygnus
            modImplementation("com.github.nebula-modding:cygnus:${p("cygnus_21.1_version")}")

            // Lazuli
            modImplementation("com.github.emmathemartian:lazuli:${p("lazuli_21.1_version")}")

            // EMI
            compileOnly("dev.emi:emi-neoforge:${p("emi_21.1_version")}+1.21.1:api")
            runtimeOnly("dev.emi:emi-neoforge:${p("emi_21.1_version")}+1.21.1")

            // JEI
            compileOnly("mezz.jei:jei-1.21.1-neoforge-api:${p("jei_21.1_version")}")
            modRuntimeOnly("mezz.jei:jei-1.21.1-neoforge:${p("jei_21.1_version")}")

            // Modrinth Stuff
            modImplementation("maven.modrinth:create:1.21.1-${p("create_version")}")
            modImplementation("maven.modrinth:appleskin:${p("appleskin_version")}+mc1.21")
            modImplementation("maven.modrinth:jade:${p("jade_21.1_version")}+neoforge")
            modImplementation("maven.modrinth:mekanism:${p("mekanism_21.1_version")}")
            // modImplementation("maven.modrinth:stellarview:${p("stellarview_21.1_version")}")

            // DevAuth
            modRuntimeOnly("me.djtheredstoner:DevAuth-neoforge:${p("devauth_version")}")

            // add Thermal later
        }
    }

    /* to be enabled when Cygnus ports
    neoforge("21:6") {
        minecraftVersion = "1.21.6"
        loaderVersion = p("neo_21.6_version")
        sourceSet.java.srcDir("src/21/6/main")

        dependsOn(common21)

        data()

        runs {
            server()
            client()
            data()
        }

        dependencies {
            // Cygnus
            modImplementation("com.github.nebula-modding:cygnus:${p("cygnus_21.6_version")}")

            // Lazuli
            modImplementation("com.github.emmathemartian:lazuli:${p("lazuli_21.6_version")}")

            // EMI
            compileOnly("dev.emi:emi-neoforge:${p("emi_21.6_version")}+1.21.6:api")
            runtimeOnly("dev.emi:emi-neoforge:${p("emi_21.6_version")}+1.21.6")

            // Modrinth Stuff
            modImplementation("maven.modrinth:create:1.21.6-${p("create_version")}")
            modImplementation("maven.modrinth:appleskin:${p("appleskin_version")}+mc1.21.6")
            modImplementation("maven.modrinth:jade:${p("jade_21.6_version")}+neoforge")
            modImplementation("maven.modrinth:mekanism:${p("mekanism_21.6_version")}")
            modImplementation("maven.modrinth:stellarview:${p("stellarview_21.6_version")}")
            // add Thermal later
        }
    }
     */
}

// Manually change the names of the finished jar files
tasks.named<Jar>("211Jar") { archiveClassifier = "1.21.1" }
// tasks.named<Jar>("216Jar") { archiveClassifier = "1.21.6" }

// YAML to lang
yamlang {
    targetSourceSets = listOf(sourceSets.main.get())
    inputDir = "assets/${p("mod_id")}/yamlang"
    outputDir = "assets/${p("mod_id")}/lang"
}

// Exclude datagen from built jars
tasks.withType<Jar>().configureEach {
    exclude("org/nebulamodding/${p("mod_id")}/datagen/*")
}

publishing {
    publications {
        register<MavenPublication>("mavenJava") {
            from(components["java"])
        }
    }
    repositories {
        maven("file://${project.projectDir}/repo")
    }
}

// download sources and javadocs
idea {
    module {
        isDownloadSources = true
        isDownloadJavadoc = true
    }
}