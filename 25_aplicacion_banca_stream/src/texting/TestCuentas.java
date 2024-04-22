package texting;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import service.CuentasService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import service.CuentasService;
class TestCuentas {

	static CuentasService service;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		service=new CuentasService();
		
	}

	@Test
	void testExisteCuenta() {
		assertTrue(service.existeCuenta("ES4720800136253000145866"));
		assertFalse(service.existeCuenta("ES111111111"));
	}

	@Test
	void testCuentasPorDivisa() {
		assertEquals(2, service.cuentasPorDivisa("EUR"));
	}
	@Test
	void testCuentasTitular() {
		assertTrue(service.buscarCuentaportitular("Fernando López Gómez").isPresent());
		assertTrue(service.buscarCuentaportitular("Paquito").isEmpty());
	}
	@Test
	void testCuentasAgrupadasPorDivisa() {
		assertEquals(2, service.cuentasPorDivisa().get("JPY").size());
	}

}
