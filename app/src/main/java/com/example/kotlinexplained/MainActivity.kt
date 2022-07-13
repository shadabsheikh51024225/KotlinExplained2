package com.example.kotlinexplained

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.example.kotlinexplained.Fragments.FirstFragment

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /**note that the fragment transaction is only created
         * when savedInstanceState is null.
         * This is to ensure that the fragment is added only once,
         * when the activity is first created.
         * When a configuration change occurs and
         * the activity is recreated,
         * savedInstanceState is no longer null,
         * and the fragment does not need to be added a second time,
         * as the fragment is automatically restored
         * from the savedInstanceState.
         * */
        if (savedInstanceState == null) {
            supportFragmentManager.commit {
                setReorderingAllowed(true)
                add<FirstFragment>(R.id.fragment_container_view)
            }
        }
    }
}