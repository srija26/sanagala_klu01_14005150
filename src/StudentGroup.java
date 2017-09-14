import java.util.Date;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Arrays;
import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
               
		return students;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
                /**
	 * Sets the array of students
	 * if students == null method should throw IllegalArgumentException
	 *
	 * @param students
	 * 
	 * @throws IllegalArgumentException
	 */
                this.students=students;
               try{
                   if(students==null){
                    System.out.println("Exception Occured");
                   }
               }
               catch(IllegalArgumentException e){
                   System.out.println(e);
                   
               }
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
                
	/**
	 * if index lower than 0 or index higher/equal students.length method should
	 * throw IllegalArgumentException
	 *
	 * @param index
	 */
        try{
        if(index<0 || index >= students.length){
            System.out.println("Index is either lower or higher than required");
        }
        }
        catch(IllegalArgumentException e){
            System.out.println(e);
        }
		return students[index];
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
               
	
                 int studlen=students.length;
                try{
                if(student == null){
                  System.out.println(student);
                }
                }
                catch(IllegalArgumentException e){
                        System.out.println(e);
                        }
                   if(index<0 || index >= students.length){
                      try{
                         System.out.println(" ");
                              
                        }
                     catch(IllegalArgumentException e){
                        System.out.println(e);
                        }
                      }
                   else {
                    for(int i=index;i<studlen;i++){
                    students[i+1]=students[i];
                }
                students[index]=student;
 }
       }
                
	@Override
	public void addFirst(Student student)throws IllegalArgumentException  {
		// Add your implementation here
                /**
	 * Inserts the specified element at the beginning of this array if student
	 * == null method should throw IllegalArgumentException
	 *
	 * @param student
	 *            the element to add
	 * 
	 * @throws IllegalArgumentException
	 */  
                if(student == null){
                 throw new IllegalArgumentException();
                }
               
               
               Student st[]= new Student[students.length+1];
               for(int i=1;i<st.length;i++){
                   st[i]=students[i-1];
                
	}
               st[0]=student;
               int c=1;
               Arrays.copyOf(students,students.length+c);
               for(int i=0;i<st.length;i++){
                   students[i]=st[i];
               }
        }
        
	@Override
	public void addLast(Student student) {
		
                  int studlen=students.length;
                  if(student==null){
                    try{
                        if(student==null){
                            System.out.println(student);
                        }
                    }
                    catch(IllegalArgumentException e){
                        System.out.println(e);
                        }
                }
                  else {
                 Arrays.copyOf(students,students.length+1);
		 students[students.length-1]=student;
	}
        }
	@Override
	public void add(Student student, int index)throws IllegalArgumentException {
 
		
                 try{
                if(student == null){
                  System.out.println(student);
                }
                }
                catch(IllegalArgumentException e){
                        System.out.println(e);
                        }
                   if(index<0 || index >= students.length){
                      try{
                          if(index<0 || index >= students.length){
                         System.out.println(" ");
                              
                        }
                      }
                     catch(IllegalArgumentException e){
                        System.out.println(e);
                        }
                      }
                   else{
                       int i;
                 Student st[]=new Student[students.length+1];
		for( i=0;i<index;i++)
		{
			st[i]=students[i];
		}
		st[index]=student;
		for(i=index+1;i<st.length;i++)
		{
			st[i]=students[i-1];
		}
		
		 Arrays.copyOf(students,students.length+1);
		 for( i=0;i<st.length;i++)
		 {
			 students[i]=st[i];
		 }
	}
        }
        

	@Override
	public void remove(int index) {
		// Add your implementation here
                
 
         if(index<0 || index >= students.length){       
        try{
        if(index<0 || index >= students.length){
            System.out.println("Index is either lower or higher than required");
        }
        }
        catch(IllegalArgumentException e){
            System.out.println(e);
        }
         }
         else{
         Student st[]=new Student[students.length-1];
		students[index]=null;
		for(int i=0;i<students.length;i++)
		{
			if(students[i]!=null)
			{
				st[i]=students[i];
			}
		}
		Arrays.copyOf(students,students.length-1);
		for( int i=0;i<st.length;i++)
		 {
			 students[i]=st[i];
		 }
		
	}
        }
	@Override
	public void remove(Student student) {
		// Add your implementation here
                
                if(student==null){
                    try{
                        if(student==null){
                            System.out.println(student);
                        }
                    }
                    catch(IllegalArgumentException e){
                        System.out.println(e);
                        }
                }
                else{
                    int i;
                    for(i=0;i<students.length;i++)
		{
			if(students[i].equals(student))
				students[i]=null;
		}
		if(i==students.length)
			throw new IllegalArgumentException();
		
		Student st[]=new Student[students.length-1];
		for(i=0;i<students.length;i++)
		 {
			if(students[i]!=null)
			{
				st[i]=students[i];
			}
		 }
		Arrays.copyOf(students,students.length-1);
		for(i=0;i<st.length;i++)
		 {
			 students[i]=st[i];
		 }
		
                
                }
	}
        

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
             
                 if(index<0 || index >= students.length){
                      try{
                          if(index<0 || index >= students.length){
                         System.out.println(" ");
                              
                        }
                      }
                     catch(IllegalArgumentException e){
                        System.out.println(e);
                        }
                      }
                 else{
                    int c=0;
		for(int i=index+1;i<students.length;i++)
		{
			students[i]=null;
			c++;
		}
		Student st[]=new Student[students.length-c];
		for(int i=0;i<students.length;i++)
		 {
			if(students[i]!=null)
			{
				st[i]=students[i];
			}
		 }
		Arrays.copyOf(students,students.length-c);
		for ( int i=0;i<st.length;i++)
		 {
			 students[i]=st[i];
		 }
		
                 }
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
      
        int count=0;
   int studlen=students.length;
    if(student==null){
                    try{
                        if(student==null){
                            System.out.println(student);
                        }
                    }
                    catch(IllegalArgumentException e){
                        System.out.println(e);
                        }
                }
    else{
  int i=0;
		for( i=students.length-1;i>=0;i--)
		{
			if(students[i].equals(student))
			{
				break;
			}
		}
		Arrays.copyOf(students,students.length-i);
            
        
	}
        }

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
                if(index<0 || index >= students.length){
                      try{
                          if(index<0 || index >= students.length){
                         System.out.println(" ");
                              
                        }
                      }
                     catch(IllegalArgumentException e){
                        System.out.println(e);
                        }
                      }
                else{
                    Student st[]=new Student[students.length-index];
		for(int i=index;i<students.length;i++)
		{
			st[i]=students[i];
		}
		Arrays.copyOf(students,students.length-index);
		for(int i=0;i<students.length;i++)
		{
			students[i]=st[i];
		}
                }
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
                /**
	 * Removes all elements to the specified element (except the specified
	 * element) from this array if student == null method should throw
	 * IllegalArgumentException
	 *
	 * @param student
	 *            the element to elements should be removed
	 * 
	 * @throws IllegalArgumentException
	 */
                if(student==null){
                    try{
                        if(student==null){
                            System.out.println(student);
                        }
                    }
                    catch(IllegalArgumentException e){
                        System.out.println(e);
                        }
                }
                else{
                    int y=0;
		for(int i=0;i<students.length;i++)
		{
			if(students.equals(student))
			{
				y=i;
                                break;
			}
		}
		Student st[]=new Student[students.length-y];
		for(int i=y;i<students.length;i++)
		{
			st[i]=students[i];
		}
		Arrays.copyOf(students,students.length-y);
		for(int i=0;i<students.length;i++)
		{
			students[i]=st[i];
		}
                }
	}

	@Override
	public void bubbleSort() {
	// Add your implementation here
        for(int i=0;i<students.length;i++)
		{
			for(int j=i+1;j<students.length;j++)
			{
				if(students[i].compareTo(students[j])>0)
				{
					Object o=students[j];
					students[i]=students[j];
					students[j]=(Student)o;
				}
			}
		}
        
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
                int c=0;
		if(date==null){
                    try{
                        if(date==null){
                            System.out.println("Exception");
                        }
                    }
                    catch(IllegalArgumentException e)
                    {
                        System.out.println(e);
                    }
                }
                else{
                   Student st[]=new Student[students.length];
		for(int i=0;i<students.length;i++)
		{
			
			if((students[i].getBirthDate()).before(date))
			{
				st[i]=students[i];
			}
			c++;
		}
                
		Arrays.copyOf(st,st.length-c);
                
		return st; 
                }
                return null;
        }
      
	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
                if(firstDate==null || lastDate == null){
                  try{
                        if(firstDate==null || lastDate == null){
                            System.out.println("Exception");
                        }
                    }
                    catch(IllegalArgumentException e)
                    {
                        System.out.println(e);
                    }   
                }
                else {
                    int c=0;
                    Student st[]=new Student[students.length];
		for(int i=0;i<students.length;i++)
		{
			
			if((students[i].getBirthDate()).before(lastDate) && (students[i].getBirthDate()).after(firstDate))
			{
				st[i]=students[i];
			}
			c++;
		}
		Arrays.copyOf(st,st.length-c);
		return st;
                }
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
                if(date==null){
                    try{
                        if(date==null){
                            System.out.println("Exception");
                        }
                    }
                    catch(IllegalArgumentException e)
                    {
                        System.out.println(e);
                    }
                }
                else{
                    return null;
                }
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
                if(indexOfStudent==0){
                     try{
                        if(indexOfStudent== 0){
                            System.out.println("Exception");
                        }
                    }
                    catch(IllegalArgumentException e)
                    {
                        System.out.println(e);
                    }
                }
                else{
                    
                }
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
                
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		double max=0;
		
		for(int i=0;i<students.length;i++)
		{
			if(students[i].getAvgMark()>max)
				max=students[i].getAvgMark();
		}
		int c=0;
		Student st[]=new Student[students.length];
		for(int i=0;i<students.length;i++)
		{
			if(students[i].getAvgMark()==max)
			{
				st[i]=students[i];
				c++;
			}
		}
		Arrays.copyOf(st,st.length-c);
		return st;
	}

	@Override
	public Student getNextStudent(Student student)throws IllegalArgumentException {
		// Add your implementation here
                if(student==null)
		{
			throw new IllegalArgumentException();
		}
		Student obj=null ;
		for(int i=0;i<students.length;i++)
		{
			
			if(students[i].equals(student))
				 obj=students[i];
		}
		
		return obj;
	}
}
