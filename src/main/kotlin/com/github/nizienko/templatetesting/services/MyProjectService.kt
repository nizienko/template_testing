package com.github.nizienko.templatetesting.services

import com.github.nizienko.templatetesting.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
