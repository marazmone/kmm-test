package com.marazmone.testkmmapplication

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform