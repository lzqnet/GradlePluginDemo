package com.zql.groovyplugin


import org.gradle.api.Plugin
import org.gradle.api.Project

class GroovyPlugin111 implements Plugin<Project> {

    private Project project

    void apply(Project project) {
        this.project = project
        project.extensions.create('test', TestExtension)
        project.task('testtask') {
            println 'hello, world!'
            def closure = project['test'].nameMap;
            if(closure!=null){
                closure('wow!');
                println project['test'].destDir
            }else {
                println "nulllllllllllllllllllllll"

            }


        }
    }

}

