package com.xworkz.intermal;

public class Identity {

    public void localId(){
        System.out.println("Running localID in Identity");
        IdCard idCard=new IdCard();
        idCard.setMaterial("Cotton");

        String color1="blue";
        String color2="white";
        String[] colors={color1,color2};
        idCard.setColor(colors);

        idCard.setWeight(25);
        idCard.setDesigned_by("Harry");

        System.out.println("The material of the id card is: "+idCard.getMaterial());
        System.out.println("The colors of ID Card is: "+idCard.getColor());
        System.out.println("The weight of ID Card is: "+idCard.getWeight());
        System.out.println("The ID Card is designed by: "+idCard.getDesigned_by());
    }

    public void idArray() {
        System.out.println("Running idArray in Identity");
        IdCard idCard = new IdCard();

        idCard.setMaterial("Plastic");
        String color = "orange";
        String color1 = "purple";
        String[] colors = {color1, color};
        idCard.setColor(colors);

        idCard.setWeight(56);
        idCard.setDesigned_by("Ron");

        IdCard idCard1 = new IdCard();
        idCard1.setMaterial("Polythene");
        String color3 = "green";
        String color4 = "yellow";
        String[] colors1 = {color3, color4};
        idCard1.setColor(colors1);

        idCard1.setWeight(34);
        idCard1.setDesigned_by("Luna");

        IdCard[] idCards = {idCard, idCard1};

        for (IdCard ref : idCards) {
            System.out.println("The material of the id card is: " + ref.getMaterial());
            System.out.println("The colors of ID Card is: " + ref.getColor());
            System.out.println("The weight of ID Card is: " + ref.getWeight());
            System.out.println("The ID Card is designed by: " + ref.getDesigned_by());

        }
    }
        public void parameterId(IdCard idCard){
            System.out.println("Running parameterId in Identity");
            if(idCard!=null){
                System.out.println("The material of the id card is: " + idCard.getMaterial());
                System.out.println("The colors of ID Card is: " + idCard.getColor());
                System.out.println("The weight of ID Card is: " + idCard.getWeight());
                System.out.println("The ID Card is designed by: " + idCard.getDesigned_by());


        }

    }

    public void paraArrayID(IdCard[] idcard){
        if(idcard!=null){
            for (IdCard idCards:idcard){
                System.out.println("The material of the id card is: " + idCards.getMaterial());
                System.out.println("The colors of ID Card is: " + idCards.getColor());
                System.out.println("The weight of ID Card is: " + idCards.getWeight());
                System.out.println("The ID Card is designed by: " + idCards.getDesigned_by());

            }

        }


    }
}
