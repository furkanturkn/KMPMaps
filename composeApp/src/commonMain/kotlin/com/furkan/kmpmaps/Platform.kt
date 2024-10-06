package com.furkan.kmpmaps

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform