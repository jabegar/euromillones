package euromillones.repositories;

import java.util.List;

import euromillones.models.Combinaciones;

public interface ICombinacionRepository {
	public List<Combinaciones> findAll();
}
