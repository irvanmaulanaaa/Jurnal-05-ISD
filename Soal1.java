// Sumber kode 
    // menggunakan ChatGPT
    // Link  : https://chat.openai.com/c/7a6b62f2-f600-4742-aaad-382bf9f10463
    // diakses pada tanggal 30 Maret 2024


    // NIM   : 607062330013
    // NAMA  : Irvan Maulana
    // KELAS : D3IF-47-04
    // infix menjadi postfix

    import java.util.Scanner; 
    import java.util.Stack;
    
    public class Soal1 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan notasi Infix : ");
            String infix = input.nextLine();                                         
            String postfix = infixToPostfix(infix);                                    
            System.out.println("Postfix : " + postfix);
            
        }

        public static String infixToPostfix(String infix) {
            Stack<Character> stack = new Stack<>();
            StringBuilder hasil = new StringBuilder();
    
            
            for (int i = 0; i < infix.length(); i++) {
                char character = infix.charAt(i);
    
                if (Character.isLetterOrDigit(character)){
                    hasil.append(character);
                } else if (character == '('){
                    stack.push(character);
                } else if (character == ')') {
                    while (!stack.isEmpty() && stack.peek() != '(')
                        hasil.append(stack.pop());
                    stack.pop();
                } else { 
                    while (!stack.isEmpty() && operator(character) <= operator(stack.peek()))
                        hasil.append(stack.pop());
    
                    stack.push(character);
                }
            }
            while (!stack.isEmpty())
                hasil.append(stack.pop());
    
            return hasil.toString();
        }
        
        static int operator(char operator) {
            switch (operator) {
                case '+':
                case '-':
                    return 1; // kedudukan pertama
                case '*':
                case '/':
                    return 2; // kedudukan kedua
                case '^':
                    return 3; // kedudukan ketiga
            }
            return -1;
        }
    }
    
    