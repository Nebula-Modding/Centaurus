plugins {
    id("java-library")
    id("maven-publish")
    id("idea")
    id("org.jetbrains.kotlin.jvm") version "2.1.0"
    id("earth.terrarium.cloche") version "0.11.4"
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

    // Lazuli
    exclusiveContent {
        forRepository {
            maven("https://jitpack.io")
        }
        filter {
            includeModule("com.github.emmathemartian", "lazuli")
        }
    }

    // For EMI
    maven("https://maven.terraformersmc.com")

    // For Mekanism
    maven("https://modmaven.dev")

    // For AppleSkin
    maven("https://maven.ryanliptak.com")

    // For Create, AppleSkin, Jade, and Stellar View
    maven("https://api.modrinth.com/maven")
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

        dependencies {
            // Lazuli
            modImplementation("com.github.emmathemartian:lazuli:${p("lazuli_21.1_version")}")

            // EMI
            compileOnly("dev.emi:emi-neoforge:${p("emi_21.1_version")}+1.21.1:api")
            runtimeOnly("dev.emi:emi-neoforge:${p("emi_21.1_version")}+1.21.1")

            // Modrinth Stuff
            modImplementation("maven.modrinth:create:1.21.1-${p("create_version")}")
            modImplementation("maven.modrinth:appleskin:${p("appleskin_version")}+mc1.21")
            modImplementation("maven.modrinth:jade:${p("jade_21.1_version")}+neoforge")
            //modImplementation("maven.modrinth:stellarview:${p("stellarview_21.1_version")}")
            // add Cygnus and Thermal later
        }
    }

    //neoforge("21:6") {
    //    minecraftVersion = "1.21.6"
    //    loaderVersion = p("neo_21.6_version")
    //    sourceSet.java.srcDir("src/21/6/main")

    //    dependsOn(common21)

    //    data()

    //    runs {
    //        server()
    //        client()
    //        data()
    //    }

    //    dependencies {
    //        // add Cygnus, Lazuli, EMI, Create, Mekanism, Thermal, Appleskin, Jade, and Stellar View when/if they update
    //    }
    //}
}

// YAML to lang
yamlang {
    targetSourceSets = listOf(sourceSets.main.get())
    inputDir = "assets/${p("mod_id")}/lang"
}

// Exclude datagen from built jars
tasks.withType<Jar>().configureEach {
    exclude("org/nebulamodding/cepheus/datagen/*")
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