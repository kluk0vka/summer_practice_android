package com.example.summer_practice_android

object FilmRepository {

    val films: List<Film> = listOf(
        Film(
            id = 0,
            title = "The Shawshank Redemption",
            yearIssue = 1994,
            pictureUrl = "https://pic.rutubelist.ru/video/ac/a8/aca823155688e35e5a60bc0fe9499c47.jpg",
            information = "Two imprisoned men bond over a number of years, " +
                    "finding solace and eventual redemption through acts of common decency."
        ),
        Film(
            id = 1,
            title = "The Godfather",
            yearIssue = 1972,
            pictureUrl = "https://posterplus.com.au/files/2020/06/b14172.jpg",
            information = "The aging patriarch of an organized crime dynasty transfers " +
                    "control of his clandestine empire to his reluctant son."
        ),
        Film(
            id = 2,
            title = "The Terminator",
            yearIssue = 1984,
            pictureUrl = "https://pic.rutubelist.ru/video/85/b7/85b75134c7b23c1df45732018fdf1556.jpg",
            information = "The story of the confrontation between soldier Kyle Reese and cyborg Terminator, "+
                    "who arrived in 1984 from the post-apocalyptic future, where the world is ruled by killer machines, "+
                    "and humanity is on the verge of extinction."

        ),
        Film(
            id = 3,
            title = "Pulp Fiction",
            yearIssue = 1994,
            pictureUrl = "https://wallha.com/download/ws/13/FUmJKEzg-wallha.com.jpg",
            information = "The lives of two mob hitmen, a boxer, a gangster and his wife, " +
                    "and a pair of diner bandits intertwine in four tales of violence and redemption."
        ),
        Film(
            id = 4,
            title = "Forrest Gump",
            yearIssue = 1994,
            pictureUrl = "https://www.fonstola.ru/images/202009/fonstola.ru_407238.jpg",
            information = "The presidencies of Kennedy and Johnson, the events of Vietnam, Watergate, " +
                    "and other historical events unfold from the perspective of an Alabama man with an IQ of 75."
        ),
        Film(
            id = 5,
            title = "Inception",
            yearIssue = 2010,
            pictureUrl = "https://i.pinimg.com/originals/ce/27/2c/ce272c7dd4bf3f749971df5209017c8a.jpg",
            information = "A thief who steals corporate secrets through the use of dream-sharing technology " +
                    "is given the inverse task of planting an idea into the mind of a C.E.O."
        ),
        Film(
            id = 6,
            title = "The Matrix",
            yearIssue = 1999,
            pictureUrl = "https://papik.pro/uploads/posts/2021-10/1634581752_3-papik-pro-p-poster-matritsa-4.jpg",
            information = "A computer hacker learns from mysterious rebels about the true nature of his reality " +
                    "and his role in the war against its controllers."
        )
    )
}