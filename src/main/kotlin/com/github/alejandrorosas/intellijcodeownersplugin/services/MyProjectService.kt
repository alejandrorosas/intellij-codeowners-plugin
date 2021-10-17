package com.github.alejandrorosas.intellijcodeownersplugin.services

import com.intellij.openapi.project.Project
import com.github.alejandrorosas.intellijcodeownersplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
