package com.example.submissionandroid;

import java.util.ArrayList;

public class BooksData {
    private static String[] bookTitles = {
            "Ayah dan Sirkus Pohon",
            "Diary Introvert",
            "Filosofi Teras",
            "MetroPop: Ganjil Genap",
            "Jika Kita Tak Pernah Jadi Apa-apa",
            "Jika Kita Tak Pernah Jatuh Cinta",
            "Nebula",
            "Sebuah Seni untuk Bersikap Bodo Amat",
            "Segala-galanya Ambyar",
            "Selena"
    };

    private static String[] bookAuthors = {
            "Andrea Hirata", "Hardy Zhu", "Henry M.", "Almira Bastari", "Alvi Syahrin",
            "Alvi Syahrin", "Tere Liye", "Mark Manson", "Mark Manson", "Tere Liye"
    };

    private static int[] booksImages = {
            R.drawable.ayah_dan_sirkus_pohon,
            R.drawable.diary_introvert,
            R.drawable.filosofi_teras,
            R.drawable.ganjil_genap,
            R.drawable.jika_kita_tak_pernah_jadi_apa,
            R.drawable.jika_kita_tak_pernah_jatuh_cinta,
            R.drawable.nebula,
            R.drawable.sebuah_seni,
            R.drawable.segalanya_ambyar,
            R.drawable.selena
    };

    private static String[] booksPrices = {
            "Rp. 69.000", "Rp. 71.500", "Rp. 98.000", "Rp. 95.000", "Rp. 88.000", "Rp. 88.000",
            "Rp. 85.000", "Rp. 90.000", "Rp. 90.000", "Rp. 85.000",
    };

    private static String[] booksPublisher = {
            "Bentang Pustaka", "TransMedia", "Buku Kompas", "Gramedia Pustaka Utama",
            "GagasMedia", "GagasMedia", "Gramedia Pustaka Utama", "Grasindo", "Grasindo",
            "Gramedia Pustaka Utama"
    };

    private static String[] bookDescription = {
            "Betapa Sabari menyayangi Zorro. Ingin dia memeluknya sepanjang waktu. Dia terpesona melihat makhluk kecil yang sangat indah dan seluruh kebaikan yang terpancar darinya. Diciuminya anak itu dari kepala sampai ke jari-jemari kakinya yang mungil. Kalau malam Sabari susah susah tidur lantaran membayangkan bermacam rencana yang akan dia lalui dengan anaknya jika besar nanti. Dia ingin mengajaknya melihat pawai 17 Agustus, mengunjungi pasar malam, membelikannya mainan, menggandengnya ke masjid, mengajarinya berpuasa dan mengaji, danmemboncengnya naik sepeda saban sore ke taman kota.",
            "Di luar sana tidak sedikit orang yang sadar akan banyaknya perbedaan, tetapi tak mau menerima perbedaan. Di luar sana banyak orang yang ingin dimengerti, tetapi enggan untuk mengerti orang lain. Bagiku introvert itu istimewa, meski banyak anggapan yang berlawanan. Menjadi introvert adalah sebuah anugerah yang aku syukuri saat ini. Jika aku tidak menjadi introvert, aku tak bisa memahami orang lain. Jika aku tidak interovert mungkin aku tidak tahu seperti apa diriku. Seorang introvert memang punya kelemahan, tetapi punya banyak cara menyiasati kekurangan itu menjadi sebuah kekuatan.",
            "Lebih dari 2.000 tahun lalu, sebuah mazhab filsafat menemukan akar masalah dan juga solusi dari banyak emosi negatif. Stoisisme, atau Filosofi Teras, adalah filsafat Yunani-Romawi kuno yang bisa membantu kita mengatasi emosi negatif dan menghasilkan mental yang tangguh dalam menghadapi naik-turunnya kehidupan. Jauh dari kesan filsafat sebagai topik berat dan mengawang-awang Filosofi Teras justru bersifat praktis dan relevan dengan kehidupan Generasi Mileniat dan Gen-Z masa kini.",
            "Gimana rasanya diputusin setelah berpacaran selama tiga belas tahun? Hidup Gala yang mendadak jomblo semakin runyam ketika adiknya kebelet nikah! Gala bertekad pantang lajang menjelang umur kepala tiga. Bersama ketiga sahabatnya, Nandi, Sydney, dan Detira, strategi pencarian jodoh pun disusun. Darat, udara, bahkan laut “disisir” demi menemukan pria idaman. Akankah Gala berhasil menemukan pasangan untuk menggenapi hari-hari ganjilnya?",
            "Kau melihat teman-teman dan mereka sudah mendapatkan impian. Sementara kau masih termangu, menggenggam harapan. Pelan, dalam hati kau berujar, “Kapan mimpiku terwujud?”\n" +
                    "\n" +
                    "Selama perjalanan mencapai tujuan, adakalanya kau melihat sekeliling… menakar jauh jangkauan. Atau, kau malah membandingkannya dengan orang lain. Lalu, lupa melanjutkan perjalanan.\n" +
                    "\n" +
                    "Benarkah segala usaha dan upayamu selama ini lebur bersama kecewa yang kau bangun sendiri? Sungguhkah sesuatu yang hanya kau lihat dalam dunia maya menjadikanmu merasa bukan apa-apa?\n" +
                    "\n" +
                    "Jika Kita Tak Pernah Jadi Apa-Apa akan menemanimu selama perjalanan. Buku ini untukmu yang khawatir tentang masa depan. Tenang saja, kau tidak sedang diburu waktu. Bacalah tiap lembarnya dengan penuh kesadaran bahwa hidup adalah tentang sebaik-baiknya berusaha, jatuh lalu bangun lagi, dan tidak berhenti percaya bahwa segala perjuanganmu tidak akan sia-sia. Bukankah sebaiknya apa-apa yang fana tidak selayaknya membuatmu kecewa?",
            "Jika kita tak pernah jatuh cinta,\n" +
                    "Kita tak akan banyak belajar dari masa lalu. Bagaimana ia mengajari kita untuk tetap kuat ketika hati teserak. Kita tak akan menjadi tangguh.\n" +
                    "Jika kita tak pernah jatuh cinta,\n" +
                    "Mungkinkah kita bisa lebih menghargai diri sendiri dengan melepaskan dia yang selalu menyakiti?\n" +
                    "Jika kita tak pernah jatuh cinta,\n" +
                    "Akankah kita pernah merasa berharganya waktu bersama dengan seseorang yang kita cinta?\n" +
                    "Terkadang, cinta memang sakit dan rumit. Namun, bisa pula membuat bahagia dan senyum tidak ada habisnya. Keduanya bersimpangan, tetapi pasti kita rasakan.",
            "SELENA dan NEBULA adalah buku ke-8 dan ke-9 yang menceritakan siapa orangtua Raib dalam serial petualangan dunia paralel. Dua buku ini sebaiknya dibaca berurutan. Kedua buku ini juga bercerita tentang Akademi Bayangan Tingkat Tinggi, sekolah terbaik di seluruh Klan Bulan. Tentang persahabatan tiga mahasiswa, yang diam-diam memiliki rencana bertualang ke tempat-tempat jauh. Tapi petualangan itu berakhir buruk, saat persahabatan mereka diuji dengan rasa suka, egoisme, dan pengkhianatan. Ada banyak karakter baru, tempat-tempat baru, juga sejarah dunia paralel yang diungkap. Di dua buku ini kalian akan berkenalan dengan salah satu karakter paling kuat di dunia paralel sejauh ini. Tapi itu jika kalian bisa menebaknya. Dua buku ini bukan akhir. Justru awal terbukanya kembali portal menuju Klan Aldebaran.",
            "Selama beberapa tahun belakangan, Mark Manson—melalui blognya yang sangat populer—telah membantu mengoreksi harapan-harapan delusional kita, baik mengenai diri kita sendiri maupun dunia. Ia kini menuangkan buah pikirnya yang keren itu di dalam buku hebat ini. Dalam hidup ini, kita hanya punya kepedulian dalam jumlah yang terbatas. Makanya, Anda harus bijaksana dalam menentukan kepedulian Anda.” Manson menciptakan momen perbincangan yang serius dan mendalam, dibungkus dengan cerita-cerita yang menghibur dan “kekinian”, serta humor yang cadas. Buku ini merupakan tamparan di wajah yang menyegarkan untuk kita semua, supaya kita bisa mulai menjalani kehidupan yang lebih memuaskan, dan apa adanya.",
            "Apakah kamu merasa kecewa dengan hidupmu? Apakah kamu merasa cemas secara terus-menerus? Apakah kamu merasa bahwa dunia di sekelilingmu buruk dan jahat? Ya, dunia ini memang kacau, dunia ini memang ambyar, tapi itu karena Anda tidak sadar bahwa harapan Anda terlalu disilaukan oleh keinginan-keinginan Anda sendiri yang tidak masuk akal. Jadi, lepaskanlah harapan - harapan itu, jika Anda ingin waras! #AmbyarkanHarapan untuk hidup yang lebih tenang.",
            "Selena dan Nebula adalah buku ke-8 dan ke-9 yang menceritakan siapa orangtua Raib dalam serial petualangan dunia paralel. Dua buku ini sebaiknya dibaca berurutan. Kedua buku ini juga bercerita tentang Akademi Bayangan Tingkat Tinggi, sekolah terbaik di seluruh Klan Bulan. Tentang persahabatan tiga mahasiswa, yang diam-diam memiliki rencana bertualang ke tempat-tempat jauh. Tapi petualangan itu berakhir buruk, saat persahabatan mereka diuji dengan rasa suka, egoisme, dan pengkhianatan. Ada banyak karakter baru, tempat-tempat baru, juga sejarah dunia paralel yang diungkap. Di dua buku ini kalian akan berkenalan dengan salah satu karakter paling kuat di dunia paralel sejauh ini. Tapi itu jika kalian bisa menebaknya. Dua buku ini bukan akhir. Justru awal terbukanya kembali portal menuju Klan Aldebaran."
    };

    static ArrayList<Book> getListData() {
        ArrayList<Book> list = new ArrayList<>();
        for (int position = 0; position < bookTitles.length; position++) {
            Book book = new Book();
            book.setTitle(bookTitles[position]);
            book.setAuthor(bookAuthors[position]);
            book.setPhoto(booksImages[position]);
            book.setPublisher(booksPublisher[position]);
            book.setPrice(booksPrices[position]);
            book.setDescription(bookDescription[position]);
            list.add(book);
        }
        return list;
    }
}
