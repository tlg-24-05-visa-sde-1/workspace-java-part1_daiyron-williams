package misc.test;

class WrappersTest {

    public static void main(String[] args) {
        String ageInput = "26";
        int age = Integer.parseInt(ageInput);   //  takes "26" -> returns int 26
        Integer ageInteger = Integer.valueOf(ageInput); //  returns an integer with 26 inside

        String populationInput = "8000000000";
        long population = Long.parseLong(populationInput);  //  returns primitive long
        Long populationLong = Long.valueOf(populationInput);    //  returns Long object

        String sizeInput = "10.5";
        double size = Double.parseDouble(sizeInput);    //  returns primitive double
        Double sizeDouble = Double.valueOf(sizeInput);  //  returns Double object

        String isRainingInput = "true";
        boolean isRaining = Boolean.parseBoolean(isRainingInput);   //  returns primitive boolean
        Boolean isRainingBoolean = Boolean.valueOf(isRainingInput); //  returns Boolean object
    }
}