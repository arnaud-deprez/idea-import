package com.jetbrains.test

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * This plugin will configure the annotation processor output
 */
public class TestPlugin implements Plugin<Project> {

    @Override
    public void apply(Project project) {
        println "test"
    }
}
