package com.example.portfolioapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val ButtonSkills = findViewById<Button>(R.id.skillBtn)
        ButtonSkills.setOnClickListener {

            intent = Intent(this, SkillsActivity::class.java)

            startActivity(intent)
        }
        val ButtonEdu = findViewById<Button>(R.id.eduBtn)
        ButtonEdu.setOnClickListener {

            intent = Intent(this, EduActivity::class.java)

            startActivity(intent)
        }
        val ButtonExp = findViewById<Button>(R.id.expBtn)
        ButtonExp.setOnClickListener {

            intent = Intent(this, EXPActivity::class.java)

            startActivity(intent)
        }
        val ButtonPrj = findViewById<Button>(R.id.prjBtn)
        ButtonPrj.setOnClickListener {

            intent = Intent(this, ProjectActivity::class.java)

            startActivity(intent)
        }
        val LinkedInIV = findViewById<ImageView>(R.id.linkedinLink)
        LinkedInIV.setOnClickListener {

            intent = Intent(this, LinkedInActivity::class.java)

            startActivity(intent)
        }
        val ResumeIV = findViewById<Button>(R.id.resume_btn)
        ResumeIV.setOnClickListener {

            intent = Intent(this, ResumeActivity::class.java)

            startActivity(intent)

        }
    }
}