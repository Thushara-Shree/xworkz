package com.xworkz.internal;

public class JuiceOrder {

        private Juice juice;
        private String customerName;
        private String orderTime;

        public JuiceOrder(Juice juice, String customerName, String orderTime) {
            this.juice = juice;
            this.customerName = customerName;
            this.orderTime = orderTime;
        }

        @Override
        public String toString() {
            return "Juice Order:\n" +
                    juice.toString() + "\n" +
                    "Customer: " + customerName + "\n" +
                    "Order Time: " + orderTime;
        }
    }


