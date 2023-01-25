package com.example.activitieskotlin


import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

 class MyStateChangeActivity :AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Initialize Activity and inflate the UI.
        Log.d("MyStateChangeActivity", "onCreate()")
    }

    override fun onRestoreInstanceState(
        savedInstanceState: Bundle?,
        persistentState: PersistableBundle?
    ) {
        super.onRestoreInstanceState(savedInstanceState, persistentState)
        // Restore UI state from the savedInstanceState.
        // This bundle has also been passed to onCreate.
        // Will only be called if the Activity has been
        // killed by the system since it was last visible.
        Log.d("MyStateChangeActivity", "onRestoreInstanceState()")
    }

    override fun onRestart() {
        super.onRestart()
        // Load changes knowing that the Activity has already
        // been visible within this process.
        Log.d("MyStateChangeActivity", "onRestart()")
    }
    override fun onStart() {
        super.onStart()
        // Apply any required UI change now that the Activity is visible.
        Log.d("MyStateChangeActivity", "onStart()")
    }
    override fun onResume() {
        super.onResume()
        // Resume any paused UI updates, threads, or processes required
        // by the Activity but suspended when it was inactive.
        Log.d("MyStateChangeActivity", "onResume()")
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
        Log.d("MyStateChangeActivity", "onSaveInstanceState()")
    }
    override fun onPause() {
        // Suspend UI updates, threads, or CPU intensive processes
        // that don't need to be updated when the Activity isn't
        // the active foreground Activity.
        super.onPause()
        Log.d("MyStateChangeActivity", "onPause()")
    }
    override fun onStop() {
        // Suspend remaining UI updates, threads, or processing
        // that aren't required when the Activity isn't visible.
        // Persist all edits or state changes
        // as after this call the process is likely to be killed.
        super.onStop()
        Log.d("MyStateChangeActivity", "onStop()")
    }
    override fun onDestroy() {
        // Clean up any resources including ending threads,
        // closing database connections etc.
        super.onDestroy()
        Log.d("MyStateChangeActivity", "onDestroy()")
    }
}

