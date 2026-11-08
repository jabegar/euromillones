package euromillones.services;

import java.util.List;

import euromillones.models.Combinaciones;

public interface ICombinacionService {
	public List<Combinaciones> listarCombinacioens();
	public String estrellaRepetida();
	public String combinacionMasFrecuente();
}
