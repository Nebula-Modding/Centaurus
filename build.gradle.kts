plugins {
    id("java-library")
    id("maven-publish")
    id("idea")
    id("org.jetbrains.kotlin.jvm") version "2.1.0"
    id("earth.terrarium.cloche") version "0.10.21"
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

        mavenFabric()
        mavenNeoforgedMeta()
        mavenNeoforged()
    }

    // EMI
    maven("https://maven.terraformersmc.com/")

    // Mekanism
    maven("https://modmaven.dev/")
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

    neoforge("1.21.1") {
        minecraftVersion = "1.21.1"
        loaderVersion = p("neo_21.1_version")

        data()

        runs {
            server()
            client()
            data()
        }

        dependencies {
            //modApi("mezz.jei:jei-1.21.1-neoforge:" + p("jei_21.1_version") + ":api")
            //modImplementation("mezz.jei:jei-1.21.1-neoforge:" + p("jei_21.1_version"))
            //modApi("dev.emi:emi-neoforge:" + p("emi_21.1_version") + ":api")
            //modImplementation("dev.emi:emi-neoforge:" + p("emi_21.1_version"))
            //modApi("mekanism:Mekanism:" + p("mekanism_21.1_version") + ":api")
            //modImplementation("mekanism:Mekanism:" + p("mekanism_21.1_version"))
        }
    }
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