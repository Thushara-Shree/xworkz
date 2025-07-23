package com.xworkz.internal;

public class ProjectorSetup {

        private String projector;
        private String roomName;
        private String setupBy;

        public ProjectorSetup(String projector, String roomName, String setupBy) {
            this.projector = projector;
            this.roomName = roomName;
            this.setupBy = setupBy;
        }

        @Override
        public String toString() {
            return "Projector Setup Details:\n" +
                    projector.toString() + "\n" +
                    "Room: " + roomName + "\n" +
                    "Setup By: " + setupBy;
        }
    }


