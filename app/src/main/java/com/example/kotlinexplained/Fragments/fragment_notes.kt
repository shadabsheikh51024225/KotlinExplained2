package com.example.kotlinexplained.Fragments

/**
 * A Fragment represents a reusable portion of your app's UI.
 * A fragment defines and manages its own layout,
 * has its own lifecycle, and can handle its own input events.
 * Fragments cannot live on their own--they must be hosted by
 * an activity or another fragment. The fragment’s view hierarchy
 * becomes part of, or attaches to, the host’s view hierarchy.
 *
 * */


/**
 *    ================== STEPS TO TAKE TO CREATE FRAGMENT ==================
 *
 *
 *
 *    STEP 1 ;- Fragments require a dependency on the
 *    AndroidX Fragment library.
 *    You need to add the Google Maven repository to
 *    your project's settings.gradle
 *
 *
 *
 *    STEP-2 ;- To include the AndroidX Fragment library to your project,
 *    add the following dependencies
 *
 *    val fragment_version = "1.5.0"

// Java language implementation
implementation("androidx.fragment:fragment:$fragment_version")
// Kotlin
implementation("androidx.fragment:fragment-ktx:$fragment_version")
 *
 *
 *
 *    STEP 3:-  It is strongly recommended to always use
 *    a FragmentContainerView as the container for fragments,
 *    as FragmentContainerView includes fixes specific to fragments that
 *    other view groups such as FrameLayout do not provide.
 *
 *
 *
 * */