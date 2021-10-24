package com.ryfazrin.mynoteapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ryfazrin.mynoteapps.databinding.ActivityNoteAddUpdateBinding
import com.ryfazrin.mynoteapps.db.NoteHelper
import com.ryfazrin.mynoteapps.entity.Note

class NoteAddUpdateActivity : AppCompatActivity() {

    private var isEdit = false
    private var note: Note? = null
    private var position: Int = 0
    private lateinit var noteHelper: NoteHelper

    private lateinit var binding: ActivityNoteAddUpdateBinding

    companion object {
        const val EXTRA_NOTE = "extra_note"
        const val EXTRA_POSITION = "extra_position"
        const val RESULT_ADD = 101
        const val RESULT_UPDATE = 201
        const val RESULT_DELETE = 301
        const val ALERT_DIALOG_CLOSE = 10
        const val ALERT_DIALOG_DELETE = 20
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note_add_update)
    }
}