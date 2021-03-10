package com.tts;

public class Books {

        String title;
        boolean loaned;

        public void Books(String bookTitle) {
            title=bookTitle;

        }

        public void loaned() {
            loaned=true;
        }

        public void returned() {
            loaned=false;
        }

        public boolean isLoaned() {
            return loaned;
        }

        public String getTitle() {
            return title;
        }

    }


