
package folder;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

/**
 *
 * @author Nutcha
 */
public class PokéClient {
    @PersistenceContext(name = "Pokemon1PU")
           static EntityManager em;
    
     static javax.ws.rs.client.Client client = ClientBuilder.newClient();


    public static void main(String[] args) {

        addPokemon(getPokemonById(1));
    }

    public static Pokemon1 getPokemonById(int id) {
        WebTarget target = client.target("https://pokeapi.co/api/v2/pokemon/" + id);
        Pokemon1 pokemon = target.request().get(Pokemon1.class);
        System.out.println(pokemon);
        return pokemon;

    }
    
    public static void addPokemon(Pokemon1 pokemon){
        em.persist(pokemon);
    }

}
