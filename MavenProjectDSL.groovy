job('DSL PROJ AUTOMATICALLY FORMED') {
    description("First Maven job generated by the DSL on ${new Date()}, the project is a small Maven project hosted on github")
    scm {
        git("https://github.com/cctnsapbn/revision.git", 'master')
    }
    triggers {
        scm('* * * * *')
    }
    steps {
        maven('clean package', 'maven-samples/single-module/pom.xml')
    }
    publishers {
        //archive the war file generated
        archiveArtifacts '**/*.*'
    }
}
