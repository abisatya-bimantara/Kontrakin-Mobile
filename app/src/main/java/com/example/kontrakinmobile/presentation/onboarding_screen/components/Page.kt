package com.example.kontrakinmobile.presentation.onboarding_screen.components

import androidx.annotation.DrawableRes
import com.example.kontrakinmobile.R

data class Page (
    val title: String,
    val description: String,
    @DrawableRes val image: Int,
)

val pages = listOf(
    Page(
        title = "Aplikasi Pencari Kontrakan Rumah Impian Anda, Sekarang Dalam Genggaman.",
        description = "Cari Kontrakan yang akurat dan tepercaya kini semakin mudah. Membantu masyarakat untuk lebih mudah mencari kontrakan layak huni",
        image = R.drawable.house_element
    ),
    Page(
        title = "Pastinya Fitur Yang Ada Bikin Kamu Betah Disini",
        description = "Kamu bisa melakukan pencarian kontrakan yang dekat dengan daerah kamu dan bisa langsung mengirimkan pesan ke pemilik secara langsung, ada juga  fitur yang bikin kamu makin nyaman, kamu dapat melakukan pembayaran seperti token listrik, tagihan listrik, non-tagihan listrik dan PDAM loh.",
        image = R.drawable.bussines_deal
    ),
    Page(
        title = "Informasi Data Kontrakan Yang Lengkap",
        description = "Kami mengelola dan menyajikan daftar kontrakan yang lengkap, serta Penjelasan fasilitas dengan foto, serta detail dari setiap Kontrakan.",
        image = R.drawable.check
    )
)