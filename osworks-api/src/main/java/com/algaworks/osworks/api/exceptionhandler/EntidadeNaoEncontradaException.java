package com.algaworks.osworks.api.exceptionhandler;

import com.algaworks.osworks.domain.exception.RegraNegocioException;

public class EntidadeNaoEncontradaException extends RegraNegocioException{

	private static final long serialVersionUID = 1L;
	
	public EntidadeNaoEncontradaException(String message) {
		super(message);

	}

	
	
}
