package br.com.screen_sounds.services;

public interface iDataConverter {
    <T> T obterDados(String json, Class<T> classe);
}
