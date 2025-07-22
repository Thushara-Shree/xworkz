package com.xworkz.internal;

public class ColorPalette {

        private String color;
        private String theme;
        private String createdBy;

        public ColorPalette(String color, String theme, String createdBy) {
            this.color = color;
            this.theme = theme;
            this.createdBy = createdBy;
        }

        @Override
        public String toString() {
            return "Color Palette:\n" +
                    color.toString() + "\n" +
                    "Theme: " + theme + "\n" +
                    "Created By: " + createdBy;
        }
    }


