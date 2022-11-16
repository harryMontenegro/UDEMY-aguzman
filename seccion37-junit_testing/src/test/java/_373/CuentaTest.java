package _373;

import _371.exceptions.DineroInsuficienteException;
import _371.models.Banco;
import _371.models.Cuenta;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CuentaTest {

    @Test
    void testNombreCuenta(){
        Cuenta cuenta = new Cuenta("Andres G", new BigDecimal("1000.12345"));
        //cuenta.setPersona("Andres");
        String esperado = "Andres";
        String real = cuenta.getPersona();
        // A todos lo métodos assertions se le puede pasar un mensaje como argumento que complementa la prueba, pero al pasarse de forma literal
        //ocurra o no ocurra el error se creara la instancia de este String consumiendo recursos.
        assertNotNull(real, "La cuenta no pude ser nula");
        //Esto se puede solventar pasando una expresión lamba con el mensaje, si la prueba pasa esos String nunca se van a instanciar.
        assertEquals(esperado, real, () -> "El nombre de la cuenta no es el que se esperaba " + esperado + " sin embarfo fue " + real );
        assertTrue(real.equals("Andres"), () -> "Esperado debe ser igual a real");
    }

    @Test
    void testSaldoCuenta(){
        Cuenta cuenta = new Cuenta("Andres", new BigDecimal("1000.12345"));
        assertNotNull(cuenta.getSaldo());
        assertEquals(1000.12345, cuenta.getSaldo().doubleValue());
        assertFalse(cuenta.getSaldo().compareTo(BigDecimal.ZERO) < 0);
        assertTrue(cuenta.getSaldo().compareTo(BigDecimal.ZERO) > 0);
    }

    @Test
    void testReferenciaCuenta() {
        Cuenta cuenta = new Cuenta("Jhon Doe", new BigDecimal("8900.9978"));
        Cuenta cuenta2 = new Cuenta("Jhon Doe", new BigDecimal("8900.9978"));
        //assertNotEquals(cuenta2, cuenta);
        assertEquals(cuenta2, cuenta);

    }

    @Test
    void testDebitoCuenta() {
        Cuenta cuenta = new Cuenta("Andres", new BigDecimal("1000.12345"));
        cuenta.debito(new BigDecimal(100));
        assertNotNull(cuenta.getSaldo());
        assertEquals(900, cuenta.getSaldo().intValue());
        //toPlainString() devuelve un string plano del BigDecimal
        assertEquals("900.12345", cuenta.getSaldo().toPlainString());
    }

    @Test
    void testCreditoCuenta() {
        Cuenta cuenta = new Cuenta("Andres", new BigDecimal("1000.12345"));
        cuenta.credito(new BigDecimal(100));
        assertNotNull(cuenta.getSaldo());
        assertEquals(1100, cuenta.getSaldo().intValue());
        //toPlainString() devuelve un string plano del BigDecimal
        assertEquals("1100.12345", cuenta.getSaldo().toPlainString());
    }

    @Test
    void testDineroInsuficienteException() {
        Cuenta cuenta = new Cuenta("Andres", new BigDecimal("1000.12345"));
        Exception exception = assertThrows(DineroInsuficienteException.class, () -> {
            cuenta.debito(new BigDecimal(1500));
        });
        String actual = exception.getMessage();
        String esperado = "Dinero Insuficiente";
        assertEquals(esperado, actual);
    }

    @Test
    void testTransferirDineroCuentas() {
        Cuenta cuenta1 = new Cuenta("Jhon Doe", new BigDecimal("2500"));
        Cuenta cuenta2 = new Cuenta("Andres", new BigDecimal("1500.8989"));

        Banco banco = new Banco();
        banco.setNombre("Banco del estado");
        banco.transferir(cuenta2, cuenta1, new BigDecimal(500));
        assertEquals("1000.8989", cuenta2.getSaldo().toPlainString());
        assertEquals("3000", cuenta1.getSaldo().toPlainString());
    }

    @Test
    void testRelacionBancoCuenta() {
        Cuenta cuenta1 = new Cuenta("Jhon Doe", new BigDecimal("2500"));
        Cuenta cuenta2 = new Cuenta("Andres", new BigDecimal("1500.8989"));

        Banco banco = new Banco();
        banco.addCuentas(cuenta1);
        banco.addCuentas(cuenta2);

        banco.setNombre("Banco del estado");
        banco.transferir(cuenta2, cuenta1, new BigDecimal(500));

        //assertAll() recibe un arreglo de expresiones lambdas executable (Executable...) y en cada uno se pasa cada assertions
        //esto permite visualizar de forma organizada las ejecuciones de los assertions en orden, ya que de forma individual
        // Si hay varios assertions que fallan solo se muestra el primero, ya que el método se detiene en la primera incidencia
        assertAll(
                () -> { assertEquals("1000.8989", cuenta2.getSaldo().toPlainString(),
                                        () -> "el valor del saldo de la cuanta2 no es el esperado"); },
                () -> { assertEquals("3000", cuenta1.getSaldo().toPlainString(),
                        () -> "el valor del saldo de la cuanta1 no es el esperado");},
                () -> { assertEquals(2, banco.getCuentas().size(),
                        () -> "el banco no tiene las cuentas esperadas");},
                () -> { assertEquals("Banco del estado", cuenta1.getBanco().getNombre()); },

                () -> { assertEquals("Andres", banco.getCuentas().stream()
                        .filter(c -> c.getPersona().equals("Andres"))
                        .findFirst()
                        .get().getPersona()); },

                () -> { assertTrue(banco.getCuentas().stream()
                        .anyMatch(c -> c.getPersona().equals("Jhon Doe"))); }
        );
    }
}



















