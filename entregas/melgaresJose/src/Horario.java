class Horario {
	public Horario()
	
	public void agregar(Asignatura asignatura, 
						Aula aula, 
						Profesor profesor, 
						DiaHora diaHoraInicio, 
						DiaHora diaHoraFinal)
	
	public void mostrar()
	public void mostrar(int dia)
	public void mostrar(Profesor profesor)
	public void mostrar(Aula aula)
	public void mostrar(Asignatura asignatura)
	
	public void editarAula(DiaHora diaHora, Aula nuevaAula)
	public void editarDuracion(DiaHora diaHoraInicio, double horas)
	public void editarDuracion(DiaHora diaHoraInicio, DiaHora diaHoraFin)
	
	public boolean estaAulaDisponible(Aula aula, DiaHora diaHora)
	public boolean estaProfesorDisponible(Profesor profesor, DiaHora diaHora)
	public boolean estaDiaHoraDisponible(DiaHora diaHora)
}	