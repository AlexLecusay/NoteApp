package com.plcoding.noteapp.feature_note.presentation.notes

import com.plcoding.noteapp.feature_note.domain.model.Note
import com.plcoding.noteapp.feature_note.domain.util.NoteOrder
import com.plcoding.noteapp.feature_note.domain.util.OrderType

data class NotesState(
    val notes : List<Note> = emptyList(),
    val noteOrder : NoteOrder = NoteOrder.Date(OrderType.Ascending),
    val isOrderSectionVisible: Boolean = false
)
