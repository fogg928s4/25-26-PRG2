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
	
	public static void main(String[] args) {
		Horario horarioUniversitario = new Horario();
		
		String[] idiomas = {"ES", "EN"};
		
		Asignatura progra2 = new Asignatura("Programacion 2", "PRG2", 6, idiomas);
		
		Aula menosDosSeis = new Aula("-2.6", 56, -2);
		
		Profesor masias = new Profesor("Manuel Masias");
		
		DiaHora ochoMartes = new DiaHora(2,8);
		DiaHora diezMartes = new DiaHora(2,10);
		
		horarioUniversitario.agregar(progra2, menosDosSeis, masias, ochoMartes, diezMartes);
	}
}	