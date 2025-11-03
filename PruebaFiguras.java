import java.util.Scanner;

class Circulo {
    int radio;

    public Circulo(int radio) {
        this.radio = radio;
    }

    public double calcularArea() {
    
        return Math.PI * Math.pow(radio, 2);
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}

class Rectangulo {
    int base;
    int altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return base * altura;
    }

    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
}

class Cuadrado {
    int lado;

    public Cuadrado(int lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        return Math.pow(lado, 2);
    }

    public double calcularPerimetro() {
        return 4 * lado;
    }
}

class TrianguloRectangulo {
    int base;
    int altura;

    public TrianguloRectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return (base * altura) / 2.0;
    }

    public double calcularPerimetro() {
        return base + altura + calcularHipotenusa();
    }

    public double calcularHipotenusa() {
        // Usa Math.pow y Math.sqrt
        return Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
    }

    public void determinarTipoTriangulo() {
        // Uso del operador lógico &&
        if (base == altura) {
            System.out.println("Es un triángulo isósceles.");
        } else if (base != altura && base > 0 && altura > 0) {
            System.out.println("Es un triángulo escaleno.");
        } else {
            System.out.println("Datos inválidos para el triángulo.");
        }
    }
}

public class PruebaFiguras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== MENÚ DE FIGURAS GEOMÉTRICAS ===");
            System.out.println("1. Círculo");
            System.out.println("2. Rectángulo");
            System.out.println("3. Cuadrado");
            System.out.println("4. Triángulo Rectángulo");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el radio: ");
                    int radio = sc.nextInt();
                    Circulo c = new Circulo(radio);
                    System.out.println("Área del círculo: " + c.calcularArea());
                    System.out.println("Perímetro del círculo: " + c.calcularPerimetro());
                    break;

                case 2:
                    System.out.print("Ingrese la base: ");
                    int baseR = sc.nextInt();
                    System.out.print("Ingrese la altura: ");
                    int alturaR = sc.nextInt();
                    Rectangulo r = new Rectangulo(baseR, alturaR);
                    System.out.println("Área del rectángulo: " + r.calcularArea());
                    System.out.println("Perímetro del rectángulo: " + r.calcularPerimetro());
                    break;

                case 3:
                    System.out.print("Ingrese el lado: ");
                    int lado = sc.nextInt();
                    Cuadrado cu = new Cuadrado(lado);
                    System.out.println("Área del cuadrado: " + cu.calcularArea());
                    System.out.println("Perímetro del cuadrado: " + cu.calcularPerimetro());
                    break;

                case 4:
                    System.out.print("Ingrese la base: ");
                    int baseT = sc.nextInt();
                    System.out.print("Ingrese la altura: ");
                    int alturaT = sc.nextInt();
                    TrianguloRectangulo t = new TrianguloRectangulo(baseT, alturaT);
                    System.out.println("Área del triángulo: " + t.calcularArea());
                    System.out.println("Perímetro del triángulo: " + t.calcularPerimetro());
                    System.out.println("Hipotenusa: " + t.calcularHipotenusa());
                    t.determinarTipoTriangulo();
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida, intenta nuevamente.");
            }

        } while (opcion != 5);

        sc.close();
    }
}
