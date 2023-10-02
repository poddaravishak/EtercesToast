# EtercesToast Library

EtercesToast is a custom toast library that enables developers to create customized toast messages with logos and text, enhancing the user experience of mobile applications.

## Getting Started

Follow these simple steps to integrate EtercesToast into your Android or Java project:

### Step 1: Add the JitPack repository to your root build.gradle

Add the following code at the end of your root-level `build.gradle` file, inside the `allprojects` block:

```gradle
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
