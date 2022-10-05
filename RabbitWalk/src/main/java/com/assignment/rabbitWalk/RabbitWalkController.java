package com.assignment.rabbitWalk;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class RabbitWalkController {
	
	@RequestMapping("/getDestinationPath")
	public String getDestinationPath() throws Exception {
		
		String destinationPath="";
	        int playGround[][] = { { 1, 0, 0, 0 },
	                         { 1, 1, 0, 1 },
	                         { 0, 1, 0, 0 },
	                         { 1, 1, 1, 1 } };

	        destinationPath= findPath(playGround);
	
	return destinationPath;
	}


	String findPath(int playGround[][])
	{	
		int playGroundSize=4;
		String pathString="";
		int previousRow=0;
		int presentRow=0;
		int presentColumn=0;
		int validBlockCount=0;
		outerLoop:
		for (int row = 0; row < playGroundSize; row++) {
		    innerLoop:
            for (int column = presentColumn; column < playGroundSize; column++) {
                
				if(playGround[row][column]==0) {
					continue outerLoop;
				}
				  if(playGround[row][column]==1)
				{	
					  validBlockCount++;
					  presentRow=row;
					  if(presentRow==previousRow){		
						if(validBlockCount>1)
						pathString=pathString+"F";
						presentColumn=column;
					}
					else
					{
						pathString=pathString+"D";
						
				}
					previousRow=presentRow;
				}
        }

	}
	
		return pathString;
	
	
	}
	
}
	
