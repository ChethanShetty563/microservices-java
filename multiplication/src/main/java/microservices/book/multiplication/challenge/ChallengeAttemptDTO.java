package microservices.book.multiplication.challenge;

import lombok.Value;


/**
 * 
 * @author CHBM
 * Attempt coming from the user
 *
 */
@Value
public class ChallengeAttemptDTO {
	
	int factorA, factorB;
	String userAlias;
	int guess;

}
