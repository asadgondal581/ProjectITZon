package com.example.projectitzon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.fragment.app.Fragment
import com.example.projectitzon.Fragments.MainFragment
import com.example.projectitzon.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null
    private var toggle: ActionBarDrawerToggle? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        binding?.apply {
            toggle = ActionBarDrawerToggle(
                this@MainActivity,
                drawerLayout,
                R.string.open,
                R.string.close
            )
            drawerLayout.addDrawerListener(toggle!!)
            toggle?.syncState()
            supportActionBar?.setDisplayHomeAsUpEnabled(true)



            binding?.indrawerMenu?.Tv1?.setOnClickListener {
                replaceFragment(MainFragment())
                Toast.makeText(this@MainActivity, "First Fragment Loaded!", Toast.LENGTH_SHORT)
                    .show()
                drawerLayout?.closeDrawers()
            }
            binding?.indrawerMenu?.Tv2?.setOnClickListener {
                replaceFragment(MainFragment())
                Toast.makeText(
                    this@MainActivity,
                    "Second Fragment Item Clicked!",
                    Toast.LENGTH_SHORT
                )
                    .show()
                drawerLayout?.closeDrawers()
            }
            binding?.indrawerMenu?.Tv3?.setOnClickListener {
                replaceFragment(MainFragment())
                Toast.makeText(this@MainActivity, "Third Fragment Item Clicked", Toast.LENGTH_SHORT)
                    .show()
                drawerLayout?.closeDrawers()
            }
            binding?.indrawerMenu?.Tv4?.setOnClickListener {
                replaceFragment(MainFragment())
                Toast.makeText(
                    this@MainActivity,
                    "Fourth Fragment Item Clicked!",
                    Toast.LENGTH_SHORT
                )
                    .show()
                drawerLayout?.closeDrawers()
            }
            binding?.indrawerMenu?.Tv5?.setOnClickListener {
                replaceFragment(MainFragment())
                Toast.makeText(
                    this@MainActivity,
                    "Fifth Fragment Item Clicked!",
                    Toast.LENGTH_SHORT
                )
                    .show()

                drawerLayout?.closeDrawers()
            }
            binding?.indrawerMenu?.Tv6?.setOnClickListener {
                replaceFragment(MainFragment())
                Toast.makeText(
                    this@MainActivity,
                    "Sixth Fragment Item Clicked!",
                    Toast.LENGTH_SHORT
                )
                    .show()

                drawerLayout?.closeDrawers()
            }





            binding?.indrawerHeader?.dropDown?.setOnClickListener {

                Toast.makeText(this@MainActivity, "Drop Down Arrow Clicked!", Toast.LENGTH_SHORT)
                    .show()

                drawerLayout?.closeDrawers()
            }

        }


    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle!!.onOptionsItemSelected(item)) {
            true
        }
        return super.onOptionsItemSelected(item)
    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout, fragment)
        fragmentTransaction.commit()
    }
}