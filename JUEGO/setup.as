package  {
	
	
	import flash.display.MovieClip;
	
	public class setup extends MovieClip{
		private var PISO_new: PISO = new PISO(); 
		private var PROTAGONISTA_new: PROTAGONISTA = new PROTAGONISTA(); 
        private var ANTAGONISTA_new: ANTAGONISTA = new ANTAGONISTA();

		public function setup() {


       // private var piso_new: piso = (); 
			
			addChild(PISO_new);
			addChild(PROTAGONISTA_new);
			addChild(ANTAGONISTA_new);
			
			PISO_new.y = 388;
			PISO_new.x = 275;
				
			
			PROTAGONISTA_new.y = 370;
			PROTAGONISTA_new.x = 275;
			
						
			ANTAGONISTA_new.y = 80;
			ANTAGONISTA_new.x = 275;
		}

	}
	
}
