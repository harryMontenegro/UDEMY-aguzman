package pruebas_anymatch_nonematch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PruebaAnyMatchNoneMatch {
    public static void main(String[] args) {

        List<String> creditosInt = Arrays.asList("CR0122","CR0124","CR0123", "CR0125");
        List<String> creditos = new ArrayList<>();

        List<PolizaCreditoRecogidos> registrosGuardados = Arrays.asList(
                new PolizaCreditoRecogidos("CR0122", true),
                new PolizaCreditoRecogidos("CR0123", true),
                new PolizaCreditoRecogidos("CR0124", false));

        //List<pruebas_anymatch_nonematch.PolizaCreditoRecogidos> lista = new ArrayList<>();


        creditos = creditosInt.stream()
                .filter(numeroCredito -> registrosGuardados
                        .stream()
                        .noneMatch(ls -> ls.getNumeroCredito().equals(numeroCredito)))
                .collect(Collectors.toList());

        List<PolizaCreditoRecogidos> polCredRecLista = new ArrayList<>();

        if(creditos.stream().anyMatch(c -> registrosGuardados.stream().noneMatch(pc -> pc.getNumeroCredito().equals(c)))){
            List<PolizaCreditoRecogidos> listafinal = new ArrayList<>();
            creditos.forEach(ele -> {
                PolizaCreditoRecogidos pol = new PolizaCreditoRecogidos(ele, true);
                listafinal.add(pol);
            });

            listafinal.forEach(System.out::println);
        }


        polCredRecLista = registrosGuardados
                .stream()
                .filter(pcrguardado -> creditosInt.stream().anyMatch(lcr -> lcr.equals(pcrguardado.getNumeroCredito())))
                .peek(pcrguardado -> pcrguardado.setIndicadorHabilitado(true))
                .collect(Collectors.toList());

        polCredRecLista.addAll(
                registrosGuardados
                    .stream()
                    .filter(pcrguardado -> creditosInt.stream().noneMatch(lcr -> lcr.equals(pcrguardado.getNumeroCredito())))
                    .peek(pcrguardado -> pcrguardado.setIndicadorHabilitado(false)).toList()
        );


        polCredRecLista.forEach(System.out::println);

    }
}
