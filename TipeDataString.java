public class TipeDataString {
    public static void main(String[] args) {
        // Perbedaan primitive dan non primitive
        String firstName= "Jovar";
        String lastname = "Rumapea";
        String fullName = firstName + " " + lastname;
        System.out.println(firstName + " " + lastname);
        System.out.println(firstName.concat(" ").concat(lastname));
        System.out.println(fullName.toLowerCase());
    }
}
