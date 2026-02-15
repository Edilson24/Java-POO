import java.util.*;

public class Algoritmo<T> {
    private Map<T, Set<T>> adjacencia;
    private boolean dirigido;

    public Algoritmo(boolean dirigido) {
        this.dirigido = dirigido;
        this.adjacencia = new HashMap<>();
    }

    public void inserirVertice(T v) {
        adjacencia.putIfAbsent(v, new HashSet<>());
    }

    public void inserirAresta(T origem, T destino) {
        inserirVertice(origem);
        inserirVertice(destino);
        adjacencia.get(origem).add(destino);
        if (!dirigido) {
            adjacencia.get(destino).add(origem);
        }
    }

    public void removerVertice(T v) {
        adjacencia.remove(v);
        for (Set<T> vizinhos : adjacencia.values()) {
            vizinhos.remove(v);
        }
    }

    public void removerAresta(T origem, T destino) {
        if (adjacencia.containsKey(origem)) {
            adjacencia.get(origem).remove(destino);
        }
        if (!dirigido && adjacencia.containsKey(destino)) {
            adjacencia.get(destino).remove(origem);
        }
    }

    public int ordem() {
        return adjacencia.size();
    }

    public int tamanho() {
        int total = adjacencia.values().stream().mapToInt(Set::size).sum();
        return dirigido ? total : total / 2;
    }

    public Set<T> vertices() {
        return adjacencia.keySet();
    }

    public Set<String> arestas() {
        Set<String> resultado = new HashSet<>();
        for (T origem : adjacencia.keySet()) {
            for (T destino : adjacencia.get(origem)) {
                if (dirigido || !resultado.contains(destino + " - " + origem)) {
                    resultado.add(origem + " - " + destino);
                }
            }
        }
        return resultado;
    }

    public Set<String> arestasIncidentes(T v) {
        Set<String> incidentes = new HashSet<>();
        if (!dirigido && adjacencia.containsKey(v)) {
            for (T vizinho : adjacencia.get(v)) {
                incidentes.add(v + " - " + vizinho);
            }
        }
        return incidentes;
    }

    public Set<String> arestasSaida(T v) {
        Set<String> saidas = new HashSet<>();
        if (dirigido && adjacencia.containsKey(v)) {
            for (T destino : adjacencia.get(v)) {
                saidas.add(v + " -> " + destino);
            }
        }
        return saidas;
    }

    public Set<String> arestasChegada(T v) {
        Set<String> chegadas = new HashSet<>();
        if (dirigido) {
            for (T origem : adjacencia.keySet()) {
                if (adjacencia.get(origem).contains(v)) {
                    chegadas.add(origem + " -> " + v);
                }
            }
        }
        return chegadas;
    }

    public String grau(T v) {
        if (!adjacencia.containsKey(v)) return "0";
        if (dirigido) {
            int entrada = arestasChegada(v).size();
            int saida = arestasSaida(v).size();
            return "Entrada: " + entrada + ", Saída: " + saida;
        }
        return "Grau: " + adjacencia.get(v).size();
    }

    // Teste simples
    public static void main(String[] args) {
        Algoritmo<String> grafo = new Algoritmo<>(false);
        grafo.inserirAresta("A", "B");
        grafo.inserirAresta("A", "C");
        grafo.inserirVertice("D");

        System.out.println("Vértices: " + grafo.vertices());
        System.out.println("Arestas: " + grafo.arestas());
        System.out.println("Ordem: " + grafo.ordem());
        System.out.println("Tamanho: " + grafo.tamanho());
        System.out.println("Arestas incidentes em A: " + grafo.arestasIncidentes("A"));
        System.out.println("Grau de A: " + grafo.grau("A"));
    }
}