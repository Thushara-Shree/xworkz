package com.xworkz.intermal;

public class IDCardRunner {
    public static void main(String[] args) {
        IdCard idCard=new IdCard();
        Identity identity=new Identity();
        identity.localId();
        identity.idArray();
        identity.parameterId(idCard);

        IdCard idCard1=new IdCard();
        idCard1.setMaterial("Paper");
        String color1="maroon";
        String color2="Sjy Blue";
        String[] colors={color1,color2};
        idCard.setColor(colors);

        idCard1.setWeight(54);
        idCard1.setDesigned_by("Lilly");

        IdCard idCard2=new IdCard();
        idCard2.setMaterial("Polymer");
        String color3="brown";
        String color4="black";
        String[] colors1={color3,color4};
        idCard1.setColor(colors1);
        idCard1.setWeight(28);
        idCard1.setDesigned_by("James");

        IdCard[] idcards={idCard1,idCard2};
        identity.paraArrayID(idcards);






    }
}
