package prj5;

public class MergeData {
    private LinkedList<Glyph> hobbyList;
    private LinkedList<Glyph> majorList;
    private LinkedList<Glyph> regionList;
    private LinkedList<String> hobbies = new LinkedList<String>();
    private LinkedList<String> majors = new LinkedList<String>();
    private LinkedList<String> regions = new LinkedList<String>();


    public MergeData(LinkedList<Response> r, LinkedList<Song> s) {
        makeLists();
        LinkedList<Double> readHeardPercent = new LinkedList<Double>();
        LinkedList<Double> readLikePercent = new LinkedList<Double>();
        LinkedList<Double> musicHeardPercent = new LinkedList<Double>();
        LinkedList<Double> musicLikePercent = new LinkedList<Double>();
        LinkedList<Double> sportsHeardPercent = new LinkedList<Double>();
        LinkedList<Double> sportsLikePercent = new LinkedList<Double>();
        LinkedList<Double> artHeardPercent = new LinkedList<Double>();
        LinkedList<Double> artLikePercent = new LinkedList<Double>();
        LinkedList<Double> csHeardPercent = new LinkedList<Double>();
        LinkedList<Double> csLikePercent = new LinkedList<Double>();
        LinkedList<Double> mathHeardPercent = new LinkedList<Double>();
        LinkedList<Double> mathLikePercent = new LinkedList<Double>();
        LinkedList<Double> engHeardPercent = new LinkedList<Double>();
        LinkedList<Double> engLikePercent = new LinkedList<Double>();
        LinkedList<Double> otherHeardPercent = new LinkedList<Double>();
        LinkedList<Double> otherLikePercent = new LinkedList<Double>();
        LinkedList<Double> northHeardPercent = new LinkedList<Double>();
        LinkedList<Double> northLikePercent = new LinkedList<Double>();
        LinkedList<Double> southHeardPercent = new LinkedList<Double>();
        LinkedList<Double> southLikePercent = new LinkedList<Double>();
        LinkedList<Double> usHeardPercent = new LinkedList<Double>();
        LinkedList<Double> usLikePercent = new LinkedList<Double>();
        LinkedList<Double> outHeardPercent = new LinkedList<Double>();
        LinkedList<Double> outLikePercent = new LinkedList<Double>();


        for (int j = 0; j < s.size(); j++) {
            double readHeardCount = 0;
            double readLikeCount = 0;
            double musicHeardCount = 0;
            double musicLikeCount = 0;
            double sportsHeardCount = 0;
            double sportsLikeCount = 0;
            double artHeardCount = 0;
            double artLikeCount = 0;
            double csHeardCount = 0;
            double csLikeCount = 0;
            double mathHeardCount = 0;
            double mathLikeCount = 0;
            double engHeardCount = 0;
            double engLikeCount = 0;
            double otherHeardCount = 0;
            double otherLikeCount = 0;
            double northHeardCount = 0;
            double northLikeCount = 0;
            double southHeardCount = 0;
            double southLikeCount = 0;
            double usHeardCount = 0;
            double usLikeCount = 0;
            double outHeardCount = 0;
            double outLikeCount = 0;



            for (int i = 0; i < r.size(); i++) {
                // for hobbies.size()
                for (int k = 0; k < hobbies.size(); k++) {
                    if (r.get(i).getHobby().equals("reading")) {
                        if(r.get(i).getHeardSongList().get(i).equals("Yes")) {
                            readHeardCount++;

                        }
                        if(r.get(i).getLikesSongList().get(i).equals("Yes")) {
                            readLikeCount++;
                        }


                    }
                    if (r.get(i).getHobby().equals("sports")) {
                        if(r.get(i).getHeardSongList().get(i).equals("Yes")) {
                            sportsHeardCount++;

                        }
                        if(r.get(i).getLikesSongList().get(i).equals("Yes")) {
                            sportsLikeCount++;
                        }


                    }
                    if (r.get(i).getHobby().equals("music")) {
                        if(r.get(i).getHeardSongList().get(i).equals("Yes")) {
                            musicHeardCount++;

                        }
                        if(r.get(i).getLikesSongList().get(i).equals("Yes")) {
                            musicLikeCount++;
                        }


                    }
                    if (r.get(i).getHobby().equals("art")) {
                        if(r.get(i).getHeardSongList().get(i).equals("Yes")) {
                            artHeardCount++;

                        }
                        if(r.get(i).getLikesSongList().get(i).equals("Yes")) {
                            artLikeCount++;
                        }


                    }
                }
                for (int k=0; k< majors.size(); k++) {
                    if (r.get(i).getMajor().equals("Math or CMDA")) {
                        if(r.get(i).getHeardSongList().get(i).equals("Yes")) {
                            mathHeardCount++;

                        }
                        if(r.get(i).getLikesSongList().get(i).equals("Yes")) {
                            mathLikeCount++;
                        }


                    }
                    if (r.get(i).getMajor().equals("Other")) {
                        if(r.get(i).getHeardSongList().get(i).equals("Yes")) {
                            otherHeardCount++;

                        }
                        if(r.get(i).getLikesSongList().get(i).equals("Yes")) {
                            otherLikeCount++;
                        }


                    }
                    if (r.get(i).getMajor().equals("Other Engineering")) {
                        if(r.get(i).getHeardSongList().get(i).equals("Yes")) {
                            engHeardCount++;
                            
                        }
                        if(r.get(i).getLikesSongList().get(i).equals("Yes")) {
                            engLikeCount++;
                        }


                    }
                    if (r.get(i).getMajor().equals("Computer Science")) {
                        System.out.println(r.get(i).getHeardSongList().get(i).toString());
                        if(r.get(i).getHeardSongList().get(i).equals("Yes")) {
                            csHeardCount++;

                        }
                        if(r.get(i).getLikesSongList().get(i).equals("Yes")) {
                            csLikeCount++;
                        }


                    }

                }
                for (int k=0; k < regions.size(); k++) {

                    if (r.get(i).getRegion().equals("Southeast")) {
                        if(r.get(i).getHeardSongList().get(i).equals("Yes")) {
                            southHeardCount++;

                        }
                        if(r.get(i).getLikesSongList().get(i).equals("Yes")) {
                            southLikeCount++;
                        }


                    }
                    if (r.get(i).getRegion().equals("Northeast")) {
                        if(r.get(i).getHeardSongList().get(i).equals("Yes")) {
                            northHeardCount++;

                        }
                        if(r.get(i).getLikesSongList().get(i).equals("Yes")) {
                            northLikeCount++;
                        }


                    }
                    if (r.get(i).getRegion().equals("United States (other than Southeast or Northwest)")) {
                        if(r.get(i).getHeardSongList().get(i).equals("Yes")) {
                            usHeardCount++;

                        }
                        if(r.get(i).getLikesSongList().get(i).equals("Yes")) {
                            usLikeCount++;
                        }


                    }
                    if (r.get(i).getRegion().equals("Outside of United States")) {
                        if(r.get(i).getHeardSongList().get(i).equals("Yes")) {
                            outHeardCount++;

                        }
                        if(r.get(i).getLikesSongList().get(i).equals("Yes")) {
                            outLikeCount++;
                        }


                    }

                }
            }
            
        
            
                // creates a glyph specific percentage hobbies
                Double readPercentage = readHeardCount / r.size();
                readHeardPercent.add(readPercentage);
                Double readlikePercentage = readLikeCount / readHeardCount;
                readLikePercent.add(readlikePercentage);

                Double artPercentage = artHeardCount / r.size();
                readHeardPercent.add(artPercentage);
                Double artlikePercentage = artLikeCount / artHeardCount;
                artLikePercent.add(artlikePercentage);

                Double sportsPercentage = sportsHeardCount / r.size();
                sportsHeardPercent.add(sportsPercentage);
                Double sportslikePercentage = sportsLikeCount / sportsHeardCount;
                sportsLikePercent.add(sportslikePercentage);

                Double musicPercentage = musicHeardCount / r.size();
                musicHeardPercent.add(musicPercentage);
                Double musiclikePercentage = musicLikeCount / musicHeardCount;
                musicLikePercent.add(musiclikePercentage);


                //creates a glyph specific percentage for majors
                Double csPercentage = csHeardCount / r.size();
                csHeardPercent.add(csPercentage);
                Double cslikePercentage = csLikeCount / csHeardCount;
                csLikePercent.add(cslikePercentage);

                Double mathPercentage = mathHeardCount / r.size();
                mathHeardPercent.add(mathPercentage);
                Double mathlikePercentage = mathLikeCount / mathHeardCount;
                mathLikePercent.add(mathlikePercentage);

                Double engPercentage = engHeardCount / r.size();
                engHeardPercent.add(engPercentage);
                Double englikePercentage = engLikeCount / engHeardCount;
                engLikePercent.add(englikePercentage);

                Double otherPercentage = otherHeardCount / r.size();
                otherHeardPercent.add(otherPercentage);
                Double otherlikePercentage = otherLikeCount / otherHeardCount;
                otherLikePercent.add(otherlikePercentage);


                // creates a glyph specific percentage for region
                Double southPercentage = southHeardCount / r.size();
                southHeardPercent.add(southPercentage);
                Double southlikePercentage = southLikeCount / southHeardCount;
                southLikePercent.add(southlikePercentage);

                Double northPercentage = northHeardCount / r.size();
                northHeardPercent.add(northPercentage);
                Double northlikePercentage = northLikeCount / northHeardCount;
                northLikePercent.add(northlikePercentage);

                Double outPercentage = outHeardCount / r.size();
                outHeardPercent.add(outPercentage);
                Double outlikePercentage = outLikeCount / outHeardCount;
                outLikePercent.add(outlikePercentage);

                Double usPercentage = usHeardCount / r.size();
                usHeardPercent.add(usPercentage);
                Double uslikePercentage = usLikeCount / usHeardCount;
                usLikePercent.add(uslikePercentage);
        





            Glyph readGlyph = new Glyph("read", s.get(j),
                readHeardPercent.get(j), readLikePercent.get(j));
            Glyph artGlyph = new Glyph("art", s.get(j),
                artHeardPercent.get(j), artLikePercent.get(j));
            Glyph musicGlyph = new Glyph("music", s.get(j),
                musicHeardPercent.get(j), musicLikePercent.get(j));
            Glyph sportsGlyph = new Glyph("sports", s.get(j),
                sportsHeardPercent.get(j), sportsLikePercent.get(j));
            
            
            Glyph mathGlyph = new Glyph("Math or CMDA", s.get(j),
                mathHeardPercent.get(j), mathLikePercent.get(j));
            Glyph engGlyph = new Glyph("Other Engineering", s.get(j),
                engHeardPercent.get(j), engLikePercent.get(j));
            Glyph otherGlyph = new Glyph("Other", s.get(j),
                otherHeardPercent.get(j), otherLikePercent.get(j));
            Glyph csGlyph = new Glyph("Computer Science", s.get(j),
                csHeardPercent.get(j), csLikePercent.get(j));
            
            Glyph northGlyph = new Glyph("Northeast", s.get(j),
                northHeardPercent.get(j), northLikePercent.get(j));
            Glyph southGlyph = new Glyph("Southeast", s.get(j),
                southHeardPercent.get(j), southLikePercent.get(j));
            Glyph usGlyph = new Glyph("United States", s.get(j),
                usHeardPercent.get(j), usLikePercent.get(j));
            Glyph outsideGlyph = new Glyph("Out of US", s.get(j),
                outHeardPercent.get(j), outLikePercent.get(j));
            
            hobbyList.add(readGlyph);
            hobbyList.add(artGlyph);
            hobbyList.add(musicGlyph);
            hobbyList.add(sportsGlyph);
            majorList.add(mathGlyph);
            majorList.add(engGlyph);
            majorList.add(otherGlyph);
            majorList.add(csGlyph);
            regionList.add(northGlyph);
            regionList.add(southGlyph);
            regionList.add(usGlyph);
            regionList.add(outsideGlyph);
            
        }
        
        
            
            


        }


        private void makeLists() {
            hobbies.add("art");
            hobbies.add("reading");
            hobbies.add("music");
            hobbies.add("sports");
            majors.add("Computer Science");
            majors.add("Math or CMDA");
            majors.add("Other Engineering");
            majors.add("Other");
            regions.add("Southeast");
            regions.add("Northeast");
            regions.add("United States (other than Southeast or Northwest)");
            regions.add("Outside of United States");
        }


        public LinkedList<Glyph> getHobbyGlyphs() {
            return hobbyList;
            
        }


        public LinkedList<Glyph> getMajorGlyphs() {
            return majorList;
        }


        public LinkedList<Glyph> getRegionGlyphs() {
            return regionList;
        }

    }
