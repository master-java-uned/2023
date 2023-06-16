package unedMasterControlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.List;

import unedMasterJavaModelo.*;
/**
 * 
 *
 */
@WebServlet("/Sesion")
public class InicioSesion extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	 private UserDbd dbd;
	    private DataDbd dataDbd;
	    private CountryDbd countryDbd;
	    private HealthIndicadorDbd healthIndicadorDbd;
	    private HealthIndicadoresDbd healthIndicadoresDbd;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InicioSesion() {
        super();
        
        
            dbd = new UserDbd();
            dataDbd = new DataDbd();
            countryDbd = new CountryDbd();
            healthIndicadorDbd = new HealthIndicadorDbd();
            healthIndicadoresDbd = new HealthIndicadoresDbd();
            
        }

    

	/**
	 
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
HttpSession sesion = request.getSession(true); //almaceno la sesion
		
		User user = new User("dinora", "root");
	
		dbd.getSession(user);
		
		String usuarioAcceso = request.getParameter("username"); //almaceno el usuario
		response.getWriter().append("\nUSUARIO: " + usuarioAcceso); //visualizao el valor del usuario

		String passAcceso = request.getParameter("password"); //almaceno el pass
		response.getWriter().append("\nPASSWORD: " + passAcceso); //visualizao el valor del pass
				
		User usuario = new User();
        usuario.setUsername(usuarioAcceso);
        usuario.setPassword(passAcceso);
        
        String tipoUsuario = dbd.getSession(usuario);
       //System.out.println("\nEl tipo de usuario es: " + tipoUsuario);
		
		
        if (tipoUsuario.equals("NO_USER")) {
        	response.sendRedirect("index.jsp?estado1");
        } else {
        	
        	
				
        	List<Country> listadoPaises = countryDbd.getAllCountry();
        	List<HealthIndicador> listadoIndicadores = healthIndicadorDbd.getAllHealth();
        	List<HealthIndicadores> listadoIndicadores1 = healthIndicadoresDbd.getAllHealth();
        	List<Data> listadoDatas = dataDbd.getAllData();
        	
        	
        	for (int i = 0; i < listadoPaises.size(); i++) {
        		
        	}
        	
        	sesion.setAttribute("listaPaises",listadoPaises);
		
        	
        	for (int i = 0; i < listadoIndicadores.size(); i++) {
        		
        	}
        	//añadimos como atributo el objeto con el arraylist de los indicadores
        	sesion.setAttribute("listaIndicadores",listadoIndicadores);
		
        	
        	for (int i = 0; i < listadoIndicadores1.size(); i++) {
        		
        	}
        	//añadimos como atributo el objeto con el arraylist de los indicadores
        	sesion.setAttribute("listaIndicadores1",listadoIndicadores1);
        	
        	//Iteramos el arraylist de datas
        	//System.out.println("Using for loop for listadoData:");
        	for (int i = 0; i < listadoDatas.size(); i++) {
        		//Iteramos el arraylist de datas
        		//System.out.println("LISTADATAS: " + listadoDatas.get(i).toString());
        	}
        	//añadimos como atributo el objeto con el arraylist de los datas
        	sesion.setAttribute("listaDatas",listadoDatas);
		
        	
        	response.sendRedirect("menu.jsp?estado=1");
        	
        }
        
        
        sesion.setAttribute("usuarioAcceso",usuarioAcceso);
      
	}

		
		
	}
