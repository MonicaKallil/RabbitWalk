package com.assignment.rabbitWalk;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rabbitWalk")
public class RabbitWalkController {
	
	@RequestMapping("/getDestinationPath")
	public String getDestinationPath() throws Exception {
		
		String destinationPath="";
	        int playGround[][] = { { 1, 0, 0, 0 },
	                         { 1, 1, 0, 1 },
	                         { 0, 1, 0, 0 },
	                         { 1, 1, 1, 1 } };
	      /*  int playGround[][] = { { 1, 1, 0, 0 }, { 0, 1, 0, 0 }, { 0, 1, 1, 0 }, { 0, 1, 0, 1 } };*/

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
		

		if((playGround[0][0]==0 || (playGround[1][0]==0 && playGround[0][1]==0))||(playGround[playGroundSize-1][playGroundSize-1]==0 || (playGround[playGroundSize-2][playGroundSize-1]==0 && playGround[playGroundSize-1][playGroundSize-2]==0))) {
			return "Rabbit will not be able to reach destination as the path is blocked.";
		}else {
		outerLoop:
		for (int row = 0; row < playGroundSize; row++) {
		    innerLoop:
            for (int column = presentColumn; column < playGroundSize; column++) {
                
				if(playGround[row][column]==0) {
					continue outerLoop;
				}else if(playGround[row][column]==1)
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
					  
					
				}else {
					return "Invalid cell present in the playGround, could not determine the path.";
				}
        }

	}
		
	
		return pathString;
	
		}
	}
	
}
	
