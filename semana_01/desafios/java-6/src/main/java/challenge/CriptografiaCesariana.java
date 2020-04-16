package challenge;

public class CriptografiaCesariana implements Criptografia {

    @Override
    public String criptografar(String texto) {

        if (texto.isEmpty()) throw new IllegalArgumentException("Text not found!");
        texto = texto.toLowerCase();

        char[] char_array = texto.toCharArray();
        String ignore_chars = "1234567890 ";
        String message = "";

        for (char ch : char_array) {
            if (ignore_chars.contains(Character.toString(ch))) {
                message = message.concat(Character.toString(ch));
                continue;
            }

            int int_char = (int) ch + 3;
            String new_char = "";

            if (int_char <= 122) {
                new_char = String.valueOf((char) int_char);
            } else {
                new_char = String.valueOf((char) (int_char - (int) 'z'));
            }
            message = message.concat(new_char);
        }
        return message;
    }

    @Override
    public String descriptografar(String texto) {

        if (texto.isEmpty()) throw new IllegalArgumentException("Text not found!");
        texto = texto.toLowerCase();

        char[] char_array = texto.toCharArray();
        String ignore_chars = "1234567890 ";
        String message = "";


        for (char ch : char_array) {
            if (ignore_chars.contains(Character.toString(ch))) {
                message = message.concat(Character.toString(ch));
                continue;
            }

            int int_char = (int) ch - 3;
            String new_char = "";

            if (int_char >= 97) {
                new_char = String.valueOf((char) int_char);
            } else {
                new_char = String.valueOf((char) (123 - ((int) 'a' - int_char)));
            }
            message = message.concat(new_char);
        }
        return message;
    }
}
