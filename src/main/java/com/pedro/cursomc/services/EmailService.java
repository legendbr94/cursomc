package com.pedro.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.pedro.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);

	void sendEmail(SimpleMailMessage msg);
}
