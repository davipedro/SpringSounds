package br.com.screen_sounds.services;

public interface iDataConverter {
    <T> T getData(String json, Class<T> classe);
}
