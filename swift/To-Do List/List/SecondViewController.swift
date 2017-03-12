//
//  SecondViewController.swift
//  List
//
//  Created by Jiho Choi on 2017. 3. 12..
//  Copyright © 2017년 iosteam. All rights reserved.
//

import UIKit

class SecondViewController: UIViewController, UITextFieldDelegate {

    @IBOutlet var txtTask: UITextField!
    @IBOutlet var txtDesc: UITextField!
    
    
    
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }
    
    // Events
    @IBAction func btnAddTask_Click(sender: UIButton) {
        taskMgr.addTask(name: txtTask.text!, desc: txtDesc.text!);
        self.view.endEditing(true)
        
        txtTask.text = ""
        txtDesc.text = ""
        self.tabBarController?.selectedIndex = 0;
        
    }
    
    override func touchesBegan(_ touches: Set<UITouch>, with event: UIEvent?) {
        self.view.endEditing(true)
    }
    
    // UITextField Delegate
    func textFieldShouldReturn( _ textField: UITextField) -> Bool {
        textField.resignFirstResponder();
        return true
    }


}

