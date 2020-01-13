package com.chrynan.sample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.chrynan.chords.model.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val chord = chord(name = "G") {
            +ChordMarker.Note(
                    finger = Finger.MIDDLE,
                    fretNumber = FretNumber(number = 3),
                    string = ChordString(number = 6, label = "E"))

            +ChordMarker.Note(
                    finger = Finger.INDEX,
                    fretNumber = FretNumber(number = 2),
                    string = ChordString(number = 5, label = "A"))

            +ChordMarker.Open(stringNumber = ChordString(number = 4, label = "D"))

            +ChordMarker.Open(stringNumber = ChordString(number = 3, label = "G"))

            +ChordMarker.Note(
                    finger = Finger.RING,
                    fretNumber = FretNumber(number = 3),
                    string = ChordString(number = 2, label = "B"))

            +ChordMarker.Note(
                    finger = Finger.PINKY,
                    fretNumber = FretNumber(number = 3),
                    string = ChordString(number = 1, label = "e"))
        }

        chordWidget?.chord = chord
    }
}
