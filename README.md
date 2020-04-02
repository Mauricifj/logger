# SimpleLogger [![Status](https://travis-ci.com/Mauricifj/simplelogger.svg?branch=master)](https://travis-ci.com/Mauricifj/simplelogger) [![Download](https://api.bintray.com/packages/mauricifj/simplelogger/simplelogger/images/download.svg)](https://bintray.com/mauricifj/simplelogger/simplelogger/_latestVersion)

**This project is a simple logger library and a sample app to test travis ci + bintray publication process.**


## Setup

- Add this dependency to your app module level build.gradle in dependencies node

```kotlin
dependencies {
    ...
    implementation 'com.mauricifj:simplelogger:1.0.0'
}
```
> Don't forget to check if you have **jcenter()** as a repository.

- Or download *simplelogger-release.aar* from [releases](https://github.com/Mauricifj/simplelogger/releases), move it to your app module libs folder and add this dependency to your app module level build.gradle in dependencies node

```kotlin
dependencies {
    ...
    implementation files('libs/simplelogger-release.aar')
}
```

## Usage

### Debug

Logs a message in debug level.

It uses "SIMPLE.LOGGER.TAG" as its tag.

````kotlin
SimpleLogger.debug("message here")
````

### Error

Logs a message and an optional throwable in error level.

It uses "SIMPLE.LOGGER.TAG" as its tag.

````kotlin
SimpleLogger.debug("message here", throwable)
````

### Info

Logs a message in info level.

It uses "SIMPLE.LOGGER.TAG" as its tag.

````kotlin
SimpleLogger.debug("message here")
````

### Warning

Logs a message in warn level.

It uses "SIMPLE.LOGGER.TAG" as its tag.

````kotlin
SimpleLogger.debug("message here")
````
