[![](https://jitpack.io/v/argenkiwi/rxmodel.svg)](https://jitpack.io/#argenkiwi/rxmodel)

# rxmodel
RxModel consists of a minimal set of classes and an interface which provide abstractions for Events and State as reactive streams. This library is the product of experimentation with the Lifecycle Extensions of the Architecture Components library combined with concepts taken from libraries like [Redux](https://github.com/reactjs/redux) and [CycleJS](https://github.com/cyclejs/cyclejs).

# Installation

If you haven't already, add JitPack's Maven repository to your project's `build.gradle` file:  
```groovy
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

Then add the following dependencies to your application's `build.gradle` file:
````groovy
dependencies {
    implementation 'io.reactivex.rxjava2:rxjava:2.+'
    implementation 'com.github.argenkiwi:rxmodel:1.1.0'
}
````
